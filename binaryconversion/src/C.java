class C 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(200));
		System.out.println(Integer.toBinaryString(500));
		System.out.println(200 | 500);   // bitwise or
		System.out.println(200 & 500);   // bitwise and
		System.out.println(200 ^ 500);   // bitwise xor
		System.out.println(35 >> 1);    // bitwise right shift by 1
		System.out.println(30 >> 2);    // bitwise right shift by 2
		System.out.println(28 << 1);    // bitwise left  shift by 1
		System.out.println(20 << 2);    // bitwise left  shift by 2
		System.out.println(Integer.parseInt("011000000",2));    // bitwise left  shift by 2
	}
}

/*
200/2 = 100 + R0
100/2 =  50 + R0
50/2  =  25 + R0
25/2  =  12 + R1
12/2  =  6  + R0
6/2   =  3  + R0
3/2   =  1  + R1
1/2   =  0  + R1


500/2 = 250 + R0
250/2 = 125 + R0
125/2 = 62  + R1
62/2  = 31  + R0
31/2  = 15  + R1
15/2  = 7   + R1
7/2   = 3   + R1
3/2   = 1   + R1
1/2   = 0   + R1


decimal to binary 200 --> 011001000
decimal to binary 500 --> 111110100

BITWISE OR 200 | 500

                          1 | 1 = 1
						  1 | 0 = 1
						  0 | 1 = 1
						  0 | 0 = 0

                          011001000
                          111110100
                        -------------
			   		      111111100     ----> 2


BITWISE And 200 & 500

                          1 & 1 = 1
						  1 & 0 = 0
						  0 & 1 = 0
						  0 & 0 = 0

                          011001000
                          111110100
                        -------------
			   		      011000000

BITWISE XOR 200 ^ 500

                          1 ^ 1 = 0
						  1 ^ 0 = 1
						  0 ^ 1 = 1
						  0 ^ 0 = 0  

                          011001000
                          111110100
                        -------------
			   		      100111100


RIGHT SHIFT BY 1 200 >> 1     
                         
                         11001000
						 01100100 

RIGHT SHIFT BY 2 200 >> 2   
                         
                         11001000
					     00110010


LEFT SHIFT BY 1 200 << 1     
                         
                         011001000
					     110010000

LEFT SHIFT BY 2 200 << 2      
                         
                         011001000
					   01100100000




*/