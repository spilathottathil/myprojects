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

/**Write a function that, given a string, will return the longest token (consecutive string of characters)
   that contains neither an a nor a b.**/

function parity(x){
    if(x%2 == 0 ? even : odd);
}

function longestToken(x){
 /Q5******/

x="ababcdababefgababhiab";
   str = x.split(/ab/);
var high =0;
var strLong = " ";

for(var i=0;i<str.length;i++){

  if(str[i].length > high){
   high=  str[i].length;
    strLong = str[i];
  }

}

}
/**
Write a function that, given an array of strings, will compute the sum of the lengths of the words
that do not contain a “q”. Do not use a loop or the forEach method, only array methods (filter, map,
reduce) and string methods/properties (indexOf, length).
**/


var input =  ["stop", "quit", "exit"];



function getWord(s){
return s.match(/q/g) == null ? s.length : 0;

}

function add(n1,n2){
  return (n1+n2);
}

function computeSum(input){
return input.map(getWord).reduce(add,0);
}