var first=1,second=2;
var result=0,sum=0;

while(result<4000000){
    if(second%2==0)
        sum+=second;
    
    result=first+second;
    first=second;
    second=result;
}
console.log(sum);