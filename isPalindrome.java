//To Check if integer is a palindrome

// Reverse the integer and then compare it with orignal number.
	public boolean isPalindrome(int x) {
        
        if( x< 0 || x == 0 ){
            return false;
        }
        int rev =0;
        int orig = x;
        while(x!=0){
            rev = rev * 10 + (x%10);
            x /= 10;
            System.out.println("x "+ x +" rev "+ rev);
            
        }
        if (rev == orig )
            return true;
        else
            return false;
        
    }
