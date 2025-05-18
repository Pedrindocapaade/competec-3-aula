import java.util.Scanner;
public class Main 
{
    public static void main(String[] args){

            System.out.println("----------------MENU--------------------" );
            System.out.println("hamburguer(1) R$20 ||| batata(2) R$10 ||| pizza(3) R$40 ||| macarrao(4) R$20");
            System.out.print("O que você vai querer(digite o codigo do produto): ");

            Scanner pd = new Scanner(System.in);
            int pedido = pd.nextInt();
          
            
            int hamburguer = 1;
            int batata = 2;
            int pizza = 3;
            int macarrao = 4;
            
            switch(pedido){
                case 1:
                    System.out.println("Voce quer comprar hamburguer");
                    break;
                case 2:
                    System.out.println("voce quer comprar batata");
                    break;
                case 3:
                    System.out.println("voce quer comprar pizza");
                    break;
                case 4:
                    System.out.println("voce quer comprar macarrão");
                    break;
            default:
                System.out.println("Tá maluco, vou te dar terra pra comer então");
                    
            }
            
            System.out.print("Quantas unidades você deseja comprar: ");
            Scanner und = new Scanner(System.in);
            int unidades = und.nextInt();
            
            switch(pedido){
                case 1:
                    System.out.println("Então voce quer comprar " + unidades + " unidades de hamburguer");
                    break;
                case 2:
                    System.out.println("Então voce quer comprar " + unidades + " unidades de batata");
                    break;
                case 3:
                    System.out.println("Então voce quer comprar " + unidades + " unidades de pizza");
                    break;
                case 4:
                    System.out.println("Então voce quer comprar " + unidades + " unidades de macarrão");
                    break;
            default:
                System.out.println("Tá maluco, vou te dar terra pra comer então");
                    
            }
           
            
            float carrinho = 0;
            
            switch(pedido){
                case 1:
                    carrinho += 20 * unidades;
                    System.out.println("voce gastou R$ "+carrinho+" com hamburguer");
                    break;
                case 2:
                    carrinho += 10 * unidades;
                    System.out.println("voce gastou R$ "+carrinho+" com batata");
                    break;
                case 3:
                    carrinho += 40 * unidades;
                    System.out.println("voce gastou R$ "+carrinho+" com pizza");
                    break;
                case 4:
                    carrinho += 20 * unidades;
                    System.out.println("voce gastou R$ "+carrinho+" com macarrão");
                    break;
            default:
                System.out.println("Tá maluco, vou te dar terra pra comer então");}
                
                
                System.out.print("Quanto você tem na sua carteira: ");
                Scanner gra = new Scanner(System.in);
                float carteira = gra.nextFloat();
                
                float sobra = carteira - carrinho;
                
                if(carteira > carrinho){
                    System.out.println("Ta com as bunfunfas, trouxe R$"+carteira+" pagou R$"+carrinho+" e ainda sobrou R$"+sobra);
                }
                else if(carteira == carrinho){
                    System.out.println("Trouxe o dinheiro contado");
                }
                else if(carteira < carrinho){
                    float conver = -sobra;
                    System.out.println("chapou, vai ficar sem comer, ficou faltando R$"+conver );
                }
                    
                
                
                    
            }
	}
