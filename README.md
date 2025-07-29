# Salary Information System

A Java-based console application that provides comprehensive salary-related calculations for employees. This system offers three essential financial computation features to help employees understand their tax obligations, bonus entitlements, and loan eligibility.

## Features

### 1. Income Tax Calculator
Calculates monthly income tax based on progressive tax brackets:
- **No tax** for salaries ≤ Rs. 100,000
- **Progressive rates** from 6% to 36% for higher salary brackets
- Accurate tax computation using Sri Lankan tax structure

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
- **Maximum monthly installment**: 60% of salary
- Uses compound interest formula for accurate calculations

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
- **Calculation Method**: Progressive tax brackets and compound interest formulas
- **Output Format**: Formatted console display with clear section headers 
