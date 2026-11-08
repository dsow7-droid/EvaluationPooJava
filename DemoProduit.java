public class DemoProduit {    
     public static void main(String[] args) {   
              Produit bissap = new Produit();    
                création d'un objet (instanciation)      
                    bissap.libelle = "Bissap 1 L";       
                  bissap.prix = 1_500;        
                  bissap.approvisionner(40); 
 
        Produit pagne = new Produit();       // un second objet, indépendant       
         pagne.libelle = "Pagne wax";       
           pagne.prix = 7_500; 
 
        System.out.println(bissap.description());        
         System.out.println(pagne.description() + " disponible ? " + pagne.estDisponible()); 
 
        Produit memeProduit = bissap;        // deux références vers le MÊME objet    
             memeProduit.prix = 1_750;
         System.out.println(bissap.prix);    
         }
         } 
    

