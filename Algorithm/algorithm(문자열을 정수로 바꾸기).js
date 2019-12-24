/* 문제 설명
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 * => - 여부 판단 후 결과에 따라 바꿔주기
 */


function solution(s) {
    var answer = 0;

    if(s.substr(0,1) == "-"){
        answer = -1 *(Number(s.substring(1,s.length)));
      }else {
        answer = Number(s);
      }
    return answer;
}