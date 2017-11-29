function Rectangle(width,height){
    this.width = width;
    this.height = height;
    Rectangle.prototype.getArea=function(){
    return this.width * this.height;
    }
}

var person = '{"firstname" : "Larry", "lastname" : "Page","cars" : "[BMW,Hyundai,Honda]"}';
   var out = [];
   Object.keys(person).forEach(function (key){
       console.log(person[key]);
   });