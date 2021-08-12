public class defangingIpAddress {
    public static void main(String[] args){
        System.out.println(defangAddress("255.100.50.0"));
    }

    public static String defangAddress(String address){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < address.length(); i++)
            sb.append((address.charAt(i) == '.')?"[.]":address.charAt(i));
        
        return sb.toString();
    }
}
