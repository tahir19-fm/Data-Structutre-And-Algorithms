
class GFG {
    
    public static int largestHist(int R, int C, int arr[]) 
    {  
        java.util.Stack<Integer> result = new java.util.Stack<> ();  
        int top_val;  
        int max_area = 0; 
        int area = 0; 
  
        int i = 0; 
        while (i < C) { 
            if (result.empty() || arr[result.peek()] <= arr[i]) 
                result.push(i++); 
  
            else { 
               
                top_val = arr[result.peek()]; 
                result.pop(); 
                area = top_val * i; 
  
                if (!result.empty()) 
                    area = top_val * (i - result.peek() - 1); 
                max_area = Math.max(area, max_area); 
            } 
        } 
  
        while (!result.empty()) { 
            top_val = arr[result.peek()]; 
            result.pop(); 
            area = top_val * i; 
            if (!result.empty()) 
                area = top_val * (i - result.peek() - 1); 
  
            max_area = Math.max(area, max_area); 
        } 
        return max_area; 
    }
    static int maxRectangle(int R, int C, int mat[][]) 
    { 
        int res = largestHist(R, C, mat[0]); 
   
        for (int i = 1; i < R; i++) { 
  
            for (int j = 0; j < C; j++) 
  
                if (mat[i][j] == 1) 
                    mat[i][j] += mat[i - 1][j]; 
 
            res = Math.max(res, largestHist(R, C, mat[i])); 
        } 
  
        return res; 
    } 
  
    public static void main(String[] args) 
    { 
        int R = 4; 
        int C = 4; 
  
        int A[][] = { 
            { 0, 1, 1, 0 }, 
            { 1, 1, 1, 1 }, 
            { 1, 1, 1, 1 }, 
            { 1, 1, 0, 0 }, 
        }; 
        System.out.print("Area of maximum rectangle is " + maxRectangle(R, C, A)); 
    } 
} 
	
