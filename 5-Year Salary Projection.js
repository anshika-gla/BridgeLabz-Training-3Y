
let currentSalary = 35000;  
let incrementRate = 10;    


let projection = [];

let salary = currentSalary;


for (let year = 1; year <= 5; year++) {

   
    salary += (salary * incrementRate) / 100;

    
    projection.push({
        Year: year,
        Salary: Math.round(salary)
    });
}


console.table(projection);
