from collections import deque

def solution(numbers, target):
    answer = 0

    #q 선언 및 초기화
    q = deque()
    q.append((0,0))
    
    while q:
        index,current_sum = q.popleft()
        
        if index==len(numbers):
            if current_sum == target:
                answer +=1
            continue
        
        next_number = numbers[index]
        
        q.append((index+1, current_sum + next_number))
        
        q.append((index+1, current_sum - next_number))
        
        
    
    
    
    return answer