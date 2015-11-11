///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package arquivomorto;
//
//import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
//import com.gargoylesoftware.htmlunit.WebClient;
//import com.gargoylesoftware.htmlunit.html.HtmlForm;
//import com.gargoylesoftware.htmlunit.html.HtmlPage;
//import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
//import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author rey salcedo
// */
//public class Captura {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        //emulamos un navegador web
//        final WebClient webClient = new WebClient();
//
//        try {
//            //Pagina donde se hara la consulta
//            HtmlPage page1 = webClient.getPage("https://www.google.com.br/");
//            
//            //nombre del formulario
//            final HtmlForm form = page1.getFormByName("f");
//            //el valor "f" no es arbitrario es el nombre del formulario web de google
//            
//            //nombre de la caja de texto
//            final HtmlTextInput textField = form.getInputByName("q");
//            //el valor "q" no es arbitrario es el nombre de la caja de texto del formulario web de google
//
//            //nombre del boton del formulario
//            final HtmlSubmitInput button = form.getInputByName("btnG");
//            //el valor "btnG" no es arbitrario es el nombre del boton del formulario web de google
//                        
//            //llenamos la caja de texto
//            textField.setValueAttribute("usandojava");
//
//            //Creamos la pagina que nos devolverá el resultado
//            final HtmlPage pageResultado;
//            
//            //hacemos clic en el boton del formulario y asignamos el resultado a la pagina pageResultado
//            pageResultado = button.click();
//            
//            //imprimimos el resultado
//            System.out.println(pageResultado.asText());
//            
//            //cerramos el navegador emulado, para liberar todo esto de la memoria
//            webClient.closeAllWindows();
//        } catch (IOException ex) {
//            Logger.getLogger(Captura.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (FailingHttpStatusCodeException ex) {
//            Logger.getLogger(Captura.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
