//Checking the boundary conditions 
//Preserved the sign of the input integer
//Question from Leet Code
public int reverse(int x) {
        //Conditional statement to check if x is negative or positive
        int sign = x <0 ? -1 :1;
        x = Math.abs(x);
        int temp=0, result= 0;
        if ( x==0 || x > 2147483647){
            return 0;
    }
        
        while (x != 0){
            temp = x % 10;
            int newResult = result*10 + temp;
            // Condition to check if the newResult overflows out of the int range
            if ((newResult - temp) / 10 != result)
                 { return 0; }
            result = newResult;
            x= x/10;
        }
        
        if (result > 2147483647){
            return 0;
        }else{
            return sign*result;
        }
        
    }
	
