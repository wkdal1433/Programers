class Solution {
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int[] end_Attack = attacks[attacks.length-1];
        boolean isattack;
        int count = 0;
        int bandage_Count =0;
        int maxHealth = health;
        while(count<=end_Attack[0]){
            isattack = false;
            for(int i =0; i<attacks.length;i++){
                if(count == attacks[i][0]){
                    health -= attacks[i][1];
                    if(health<=0){
                        return -1;
                    }
                    isattack = true;
                    bandage_Count = 0;
                }
            }
            if(!isattack){
                bandage_Count++;
                health +=bandage[1];
                if(bandage_Count==bandage[0]){
                    health += bandage[2];
                    bandage_Count = 0;
                }
                if(health >= maxHealth){
                    health = maxHealth;
                }
            }
            count++;
        }
        return health;
    }
}