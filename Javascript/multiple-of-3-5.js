var number=1000;
var sum=0;

sum+=sumOfMultiples(3);
sum+=sumOfMultiples(5);
sum-=sumOfMultiples(15);
console.log(sum);

function sumOfMultiples(factor){
    var noOfMultiples = parseInt((number-1)/factor);
    return (factor*parseInt(noOfMultiples*(noOfMultiples+1))/2); // eg: factor*(n*(n+1)/2) 
}
