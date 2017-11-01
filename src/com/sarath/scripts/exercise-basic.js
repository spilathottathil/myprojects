//Q1
function f1(n){
 return n+1;
 };

 function f2(x){
 return x+2;};

 function composedValue(f1,f2,y){

 return f1(f2(y));
 };

composedValue(f1,f2,10);

//Q2

function square(x){
return x*x;
}

var sq = function map(int[] input, operation){
    var out = out[input.length];
    for(i=0;i<input.length;i++){
        out[i]= square(input[i]);
    }
    return out;
}
/************/
//Q4
function square(x){
return x*x;
}

 function map(input, operation){
    var out = new Array;
    for(i=0;i<input.length;i++){
        out[i]= square(input[i]);
    }
    return out;
}

/**********/
