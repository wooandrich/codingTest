import java.util.*;
import java.io.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        
        sb.reverse();

        return sb.toString();
    }
}