package chatbot;

import Try_Google_Speech_Recognition_Simple.RecFalaPtBrGoogle;

import com.darkprograms.speech.recognizer.GoogleResponse;


public class ChatBot_ReconhecimentoFala extends RecFalaPtBrGoogle {

    public static void main(String[] args) {
        
        // Para ativar o debug da fala..
        boolean _debugEnabled = true;

        ChatBot_ReconhecimentoFala chatBot = new ChatBot_ReconhecimentoFala() {
            @Override
            public void resultado(String result) {
                if(_debugEnabled)
                    System.out.println("__[debug] Texto falado : " + result);
                
                
                switch(result.toLowerCase()) {
                    case "oi": {
                        System.out.println("Olá, tudo bem com você?");
                        break;
                    }
                    
                    case "bem e você": {
                       System.out.println("Ótimo, também estou bem, obrigado por perguntar!");
                       break;
                    }
                    
                    case "nome": {
                        System.out.println("Olá, eu sou um NPC e me chamo adejajohnson!");
                        break;
                    }
                    
                    case "parar": {
                        System.out.println("Foi ótimo conversar com você, até a próxima!");
                        // Encerrar as atividades com o bot!
                        this.parar();
                    }
                }
            }
            
            @Override
            public void onResponse(GoogleResponse paramGoogleResponse) {
                 throw new UnsupportedOperationException("response__ " + paramGoogleResponse);
            }
        };

        // Parametro verdadeiro é para mostrar a interface.
        chatBot.ini(true);
        chatBot.iniciar();
    }
}
