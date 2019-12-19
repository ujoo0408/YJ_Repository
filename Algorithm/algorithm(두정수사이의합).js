//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.

function solution(a, b) {
    var answer = 0;

    if(a != b) {
        if(a < b){
        for(var i = a  ; i < b+1 ; i++) {
            answer = answer + i;
        }
        } else {
         for(i = b ; i < a+1 ; i++) {
            answer = answer + i;
            }	
         }
    } else {
        answer = a;
    }
    return answer;
}
