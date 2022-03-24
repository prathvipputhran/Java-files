​import​ ​java.util.*​; 
 ​class​ ​book 
 ​{ 
 ​  ​String​ name, author; 
 ​  ​int​ price, num_pages; 
 ​  ​book​(​String​ ​name​, ​String​ ​author​, ​int​ ​price​, ​int​ ​num_pages​) 
 ​  { 
 ​    ​this​.​name ​=​ name; 
 ​    ​this​.​author ​=​ author; 
 ​    ​this​.​price ​=​ price; 
 ​    ​this​.​num_pages ​=​ num_pages; 
 ​  } 
 ​  
 ​  ​public​ ​String​ ​toString​() 
 ​  { 
 ​    ​return​ name​+​"​ ​"​+​author​+​"​ ​"​+​price​+​"​ ​"​+​num_pages;   
 ​  } 
  
 ​  ​public​ ​static​ ​void​ ​main​(​String​ ​args​[]) 
 ​  { 
 ​    ​Scanner​ sc ​=​ ​new​ ​Scanner​(​System​.​in); 
 ​    ​System​.​out​.​print(​"​Enter the total no. of books : ​"​); 
 ​    ​int​ n ​=​ sc​.​nextInt(); 
 ​    book b1 ​=​ ​new​ book(​"​J K Rowling​"​, ​"​Harrry Potter​"​, ​600​, ​1000​); 
 ​    ​System​.​out​.​println(b1​.​toString()); 
 ​    book b[] ​=​ ​new​ ​book​[n]; 
 ​    ​for​(​int​ i ​=​ ​0​; i ​<​ n; i​++​) 
 ​    { 
 ​      ​String​ name, author; 
 ​      ​int​ price, num_pages; 
 ​      ​System​.​out​.​print(​"​\n​Enter the Author of the book : ​"​); 
 ​      author ​=​ sc​.​next(); 
 ​      ​System​.​out​.​print(​"​\n​Enter the name of the book : ​"​); 
 ​      name ​=​ sc​.​next(); 
 ​      ​System​.​out​.​print(​"​\n​Enter the price of the book : ​"​); 
 ​      price ​=​ sc​.​nextInt(); 
 ​      ​System​.​out​.​print(​"​\n​Enter the no. pages of the book : ​"​); 
 ​      num_pages ​=​ sc​.​nextInt(); 
 ​      b[i] ​=​ ​new​ book(name, author,price, num_pages); 
 ​    } 
  
 ​    ​for​(​int​ i ​=​ ​0​; i ​<​ n; i​++​) 
 ​    { 
 ​      ​System​.​out​.​println(b[i]​.​toString()); 
 ​    } 
  
 ​  } 
 ​}