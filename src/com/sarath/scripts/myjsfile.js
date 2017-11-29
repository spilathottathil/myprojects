//Constructor defines the Class. See below.

function Person(firstname,lastname){
this.firstname = firstname;
this.lastname = lastname;
/*as member functions. not a good practise because js will store separate instance for every object.
So instead define it as a class level property. */
Person.prototype.fullName = function(){
return this.firstname + " "+ this.lastname;
}
}

var p = new Person("Sarath", "Pila");
p.fullName();

p.firstname;
p.firstname;

//now instance variables can be functions as well or we can say:
p.middleName = function(){
return this.fullName + "Kavya";
}

p.middleName;

//namespace = group together by some name.
var MathSarath = {};
//then create the annonymous function and assign it.
MathSarath.fact = function(n){
    if(n<=1){
    return 1;
    }
    return (n * MathSarath.fact(n-1);
 };

 /**
 In Javascript you can have annonymous functions, instanceof , typeof (number,string,object,undefined)
 and add methods to existing Classes even libraries. This is colorfull.
 **/
 String.prototype.mylength = function(){
 return "length is "+ this.length;
 }

 function f1(n){
 return n+1;
 }

 function f2(x){
 return x+2;}

 function composedValue(fi,f2,y){
 var first = f2(y);
 var sec = f1(first);
 return sec;
 }

//convert json in to an array.
var jsondata = '{
                 "name":"John",
               "age":"30",
               "cars":[ "Ford", "BMW", "Fiat" ]
               }';

//convert to array
var outarray = [];
for(var i in jsondata){
    outarray.push([i,jsondata[i]]);
}
outarray.toString();
//another approach
keys.forEach(function(key){
    outarray.push(jsondata[key]);
});

//closures in js. uses local variables inside fucntion.
function makeMulttimer(){
    return function(n,m){ return n * m;
    };
}

