import java.util.*;

class Solution {
// 문제 풀이 로직(https://velog.io/@suk13574/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Java-%EA%B0%80%EC%9E%A5-%EB%A8%BC-%EB%85%B8%EB%93%9C
//    을 보고 이해한 내용으로 직접 코딩했음)

//    여기서 문제에서 처음 주어지는 인자 값은 node 개수인 n 과 {{1,2} {2,3}} 이런 애들이 있는 edge가 있음.

//   그래프는 ArrayList인데 그 안의 요소는 1번 노드,2번 노드, 3번 노드,,, 이런식으로 되어있음.
//   그래서 노드 자체도 리스트로 표현되어서 1번 노드를 불렀을 때 {2,3,5}이런식으로 값이 나오는데 의미는
//   1번 노드에 연결된 애들은 2,3,5 가 있다는 의미임.
//   이걸 불러서 방문안한 애들이면 큐에 넣어서 큐가 계속 돌아가게 하고, 그 와중에 maxdepth는 0으로 설정해두고, 현재 depth 변수를 둠
//   maxdepth보다 현재 depth가 크다면, 우리가 구하는 최대 depth인 노드의 개수를 의미하는 answer는 1로 초기화할 것임.
//   그리고 현재 depth를 maxdepth로 둘 것임..
//    maxdepth와 현재 depth가 같다면 answer를 한개 늘려줄 것.

//    즉 sol에서는 우리가 사용하기 쉬운 1번 노드는 어디 어디와 연결되있다 를 나타내는 그래프를 만들어 주고
//    채워준 다음에 bfs를 불러서 변수로는 (graph, 노드개수, 방문했는지)
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    boolean[] visited;




    public int solution(int n, int[][] edge) {
        //이 부분은 그래프 안의 요소도 arrayList로 채워서 각 요소인 노드가 연결된 애들을 담고있도록 만드는 것임..
        for (int i= 0; i<= n; i++){graph.add(new ArrayList<>());}

        //이 부분은 {{1,2} {2,3}} 형태로 된 애들 중에서 하나씩 꺼내서 우리가 다룰 그래프로 만들어 주는 것.
        for(int []i : edge){
            int v = i[0];// 위 예시처럼 {{1,2} {2,3}}에서 i가 0이라면 i = {1,2}이고, i[0]은 1 i[1] 은 2임.
            int w = i[1];// 마찬가지로 w에 넣어주고
            graph.get(v).add(w);//v번째 노드에 w를 집어넣어 줄 것.
            graph.get(w).add(v);//무방향이기 때문에 w번째 노드에도 v를 집어넣어 줄 것임.
        }
        //위 과정을 통해 만들어진 우리의 그래프는 예를 들어 아래처럼 출력시킬 수 있는 애가 됨
        // 1-> {2,3,5}
        // 2-> {1,5}
        //...

        //이제 visited를 초기화 해 주고, bfs를 불러서 우리가 만든 애들 넣어주면 끝임.
        visited = new boolean[n+1];
        return bfs(graph,n,visited);
    }

    private int bfs(ArrayList<ArrayList<Integer>> graph, int n, boolean[] visited) {
        // 우리의 큐는 어떤 형태를 가질 거냐면,, {1,0}같은 array를 요소로 갖는 큐가 될 것임.
        //이때 1의 위치는 노드의 번호를 의미하며, 0의 위치는 해당 노드의 깊이를 의미.
        Queue<int[]> q = new LinkedList<>();

        int answer = 0;
        q.add(new int[]{1,0});// 만들어 놓은 큐에 문제에서 제시한 시작 노드인 1을 집어 넣고, 1번 노드의 깊이는 0으로 설정 해준 것.
        visited[1] = true;//1번노드의 방문을 true로 설정
        int maxdepth = 0; // 최대 깊이를 0으로 초기 설정해 주고, q가 빌 때까지 반복문을 돌려서 현재 큐의 꺼낸 요소의 연결된
        //애들 중에서 visted가 false인 애들을 큐에 넣어주고 빼고를 반복할 것..

        while (!q.isEmpty()){
            int arr[] = q.poll();
            int v = arr[0];// 현재 노드
            int depth = arr[1]; // 현재 노드의 깊이

            if(maxdepth==depth) answer++;
            else if (maxdepth<depth) {
                maxdepth = depth;
                answer = 1;
            }

            for(int i=0; i<graph.get(v).size();i++){
                int w = graph.get(v).get(i);
                if(visited[w]==false){
                    q.add(new int[]{w,depth+1});
                    visited[w]=true;
                }
            }
        }
        return answer;
    }

}