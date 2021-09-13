public class NameEncoderDecoder{

public String encode(String name){

 String str1 = name.replaceAll("e","1").replaceAll("u","2").replaceAll("i","3").replaceAll("o","4")
 .replaceAll("a","5");
  
 return "NOTFORYOU"+str1+"YESNOTFORYOU";
}

 public String decode(String name){
 
   return name.replaceAll("1","e")
     .replaceAll("2","u")
     .replaceAll("3","i")
     .replaceAll("4","o")
     .replaceAll("5","a")
   .replaceFirst("NOTFORYOU","")
   .replaceFirst("YESNOTFORYOU","");
 
 }
  

}
