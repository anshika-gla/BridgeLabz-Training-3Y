// Declare variables of different data types
let userName = "Anshika";              // string  
let userAge = 21;                      // number
let isActive = true;                   // boolean
let hobbies = ["reading", "coding"];   // array
let profile = { city: "Delhi", id: 101 }; // object
let emptyValue = null;                 // null
let notAssigned;                       // undefined

// Prepare data summary
let report = [
  { label: "userName",    value: userName,    type: typeof userName },
  { label: "userAge",     value: userAge,     type: typeof userAge },
  { label: "isActive",    value: isActive,    type: typeof isActive },
  { label: "hobbies",     value: hobbies,     type: Array.isArray(hobbies) ? "array" : typeof hobbies },
  { label: "profile",     value: profile,     type: typeof profile },
  { label: "emptyValue",  value: emptyValue,  type: "null" },  // typeof null returns "object", so fix manually
  { label: "notAssigned", value: notAssigned, type: typeof notAssigned }
];

// Print full formatted report
console.table(report);
