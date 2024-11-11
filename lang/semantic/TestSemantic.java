/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.semantic;

import java.io.*;



public class TestSemantic {
   private SemanticAdaptor idp;
   private String okSrcs = "testes/semantica/certo/";
   private File f;
   
   public TestSemantic(SemanticAdaptor idp){
        this.idp = idp;
        f = new File(okSrcs);
        runOkTests();
   }
   
   private String filler(int n){
      String s = "";
      for(int i =0; i< n; i++){ s += " "; }
      return s;
   }
   
   public void runOkTests(){
       File inst[];
       int flips, flops;
       flips = 0;
       flops = 0;
       try{
           if( f.isDirectory() ){
               String pth;
               inst = f.listFiles();
               for(File s : inst){
                   pth = s.getPath();
                   System.out.print("Testando " + pth + filler(50 -pth.length()) + "[");
                   if(idp.parseFile(s.getPath()) != null){
                       System.out.println("  OK  ]");
                       flips++;
                   }else{ 
                      System.out.println("FALHOU]");
                      flops++;
                   }
               }
               System.out.println("Total de acertos: " + flips );
               System.out.println("Total de erros: " + flops );
           }else{
              System.out.println("O caminho " + f.getPath() + " não é um diretório ou não existe.");
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
   }
}

