var number=1000;
var sum=0;

for(let i=1;i<number;i++){
    sum+=multiples(i,3);
    sum+=multiples(i,5);
    sum-=multiples(i,3*5);
}
console.log(sum);

function multiples(i,num){
    if(i%num==0){
        return i;
    }
    return 0;
}