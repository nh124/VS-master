/* 
reassigning a variable -> "let"
not reassigning a variable -> "const"
Do not use var
*/

// functions or a class 

function greet(naming){ 
    let name;
    let age;
    let person = { // objects
        name: 'Dan',
        age: 12,
        draw: function(){ // methods
            console.log('drawing');
        }
    };
    person.name = 'John';
    person[name] = 'Marry'; // another way of setting variables
    // Selection -> more dynamic
    let colors = [];
    let i;
    let size = 7;
    for(i = 0; i < size; i++){
        colors.push(i+1);
    }
    // to add to an array in javaScript -> .push
    
    console.log(colors);
    console.log('Hello ' + naming);
}

greet('Dan');