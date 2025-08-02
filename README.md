# Salary Information System

A Java-based console application that provides comprehensive salary-related calculations for employees. This system offers three essential financial computation features to help employees understand their tax obligations, bonus entitlements, and loan eligibility.

## Features

### 1. Income Tax Calculator
Calculates monthly income tax based on progressive tax brackets:
- **No tax** for salaries ≤ Rs. 100,000
- **6%** for salaries between Rs. 100,000 - Rs. 141,667
- **18%** for salaries between Rs. 141,667 - Rs. 183,333
- **36%** for salaries between Rs. 183,333 - Rs. 225,000
- **60%** for salaries between Rs. 225,000 - Rs. 266,667
- **90%** for salaries between Rs. 266,667 - Rs. 308,333
- Higher bracket calculation for salaries above Rs. 308,333
- Results displayed as rounded integers

### 2. Annual Bonus Calculator
Determines annual bonus based on salary tiers:
- **Fixed bonus**: Rs. 5,000 for salaries < Rs. 100,000
- **10%** of salary for Rs. 100,000 - Rs. 199,999
- **15%** of salary for Rs. 200,000 - Rs. 299,999
- **20%** of salary for Rs. 300,000 - Rs. 399,999
- **35%** of salary for Rs. 400,000 and above

### 3. Loan Amount Calculator
Calculates maximum loan eligibility:
- **Minimum salary requirement**: Rs. 50,000
- **Maximum loan period**: 5 years
- **Interest rate**: 15% per annum
- **Monthly installment**: Fixed at 60% of salary
- Loan amount calculated using monthly installment payment formula
- Result rounded to nearest thousand

## How to Use

1. **Compile the program**:
   ```bash
   javac SalaryInformation.java
   ```

2. **Run the application**:
   ```bash
   java SalaryInformation
   ```

3. **Follow the menu**:
   - Enter `1` for Income Tax calculation
   - Enter `2` for Annual Bonus calculation
   - Enter `3` for Loan Amount calculation

4. **Provide required information**:
   - Employee name
   - Monthly salary
   - Number of years (for loan calculation only)

## System Requirements

- Java 8 or higher
- Command line interface
- Scanner input capability

## Sample Output

```
-------------------------------------------------------------------------
|                       SALARY INFORMATION SYSTEM                       |
-------------------------------------------------------------------------

        [1] Calculate Income Tax
        [2] Calculate Annual Bonus
        [3] Calculate Loan Amount

Enter an option to continue > 
```

## Technical Details

- **Language**: Java
- **Input Method**: Scanner class for console input
- **Calculation Method**: 
  - Income Tax: Progressive tax brackets with rates from 6% to 36%
  - Annual Bonus: Percentage based on salary tiers
  - Loan: Monthly installment method using (PMT × (1 - (1 / (1 + r)^n))) / r formula
    where PMT = 60% of salary, r = monthly interest rate (15%/12), n = loan term in months
- **Error Handling**: Includes validation for loan eligibility (salary ≥ Rs. 50,000)
- **Output Format**: Clearly formatted console display with section headers and borders 
