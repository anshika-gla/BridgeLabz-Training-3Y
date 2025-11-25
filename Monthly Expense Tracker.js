
let expenses = [5000, 1500, 8000, 2000, 1200];


let total = 0;
for (let i = 0; i < expenses.length; i++) {
    total += expenses[i];
}


let average = total / expenses.length;


let tax = total * 0.10;
let finalAmount = total;
finalAmount += tax; 


console.log(`Total Monthly Expense: ₹${total.toFixed(2)}`);
console.log(`Average Expense: ₹${average.toFixed(2)}`);
console.log(`Final Amount After 10% Tax: ₹${finalAmount.toFixed(2)}`);
