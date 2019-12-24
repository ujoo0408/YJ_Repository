/* 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * => for 문에서 tmpx 에 넣어주면서 배열에 추가한다.
 */

function solution(x, n) {
    var answer = [];
    var sum = x;
    for(var i = 0; i<n; i++) {
        answer.push(sum);
        sum += x;
    }
    return answer;
}



/*다른사람의 풀이*/
/*
function solution(x, n) {
    return Array(n).fill(x).map((v, i) => (i + 1) * v)
	
# arr.fill(value[, start[, end]])
  => 배열의 시작 인덱스부터 끝 인덱스의 이전까지 정적인 값 하나로 채우는 매서드	
# arr.map()
  => 새로운 배열 요소를 생성하는 함수

   Array(n) => 배열 크기가 n   [,,,,]
   fill(x) => x로 배열 채운다   [2,2,2,2,2] 
   map((v, i) => (i + 1) * v) => (원래값,위치)=> (위치값+1)*원래값  [2,4,6,8,10]
   
*/