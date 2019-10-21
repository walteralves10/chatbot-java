package chatbot;

import Try_Google_Speech_Recognition_Simple.RecFalaPtBrGoogle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.darkprograms.speech.recognizer.GoogleResponse;
import com.darkprograms.speech.synthesiser.SynthesiserV2;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import view.ChatScreen;

/**
 * Arquivo do reconhecimento de fala.
 *
 * @author Adejair Júnior
 *
 * case : { try { ChatScreen.textVoice.append("-> "+ResponseBotSounds.+"\n");
 * responder(ResponseBotSounds.); result = null; perguntou = true; parar();
 * timer.schedule(task, delay); } catch (JavaLayerException ex) {
 * Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null,ex);
 * } * //break; }
 */
public class ServerBotSounds extends RecFalaPtBrGoogle {

    public static boolean perguntou = false;
    public static ServerBotSounds chatBot;

    public static void serverSounds() {

        /*ChatBot_ReconhecimentoFala*/
        chatBot = new ServerBotSounds() {
            //String controller = "";

            @Override
            public void resultado(String result) {

                TimerTask task = new TimerTask() {
                    public void run() {
                        perguntou = false;
                        System.out.println(perguntou);

                        iniciar();

                    }
                };
                Timer timer = new Timer("Timer");
                long delay = 2000L;

                if (!perguntou) {
                    //switch () {

                        if((result+"").toLowerCase().contains(PhrasesPLN.INPUTTIMEOUTREQUEST))  {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTTIMEOUTREQUEST + "\n");

                                responder(ResponseBotSounds.OUTPUTTIMEOUTREQUEST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            ////break;
                        }
                        if((result+"").toLowerCase().contains(PhrasesPLN.INPUTTIMEOUTREQUEST2)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTTIMEOUTREQUEST + "\n");

                                responder(ResponseBotSounds.OUTPUTTIMEOUTREQUEST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if((result+"").toLowerCase().contains(PhrasesPLN.INPUTTIMEOUTREQUEST3)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTTIMEOUTREQUEST + "\n");

                                responder(ResponseBotSounds.OUTPUTTIMEOUTREQUEST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if((result+"").toLowerCase().contains(PhrasesPLN.INPUTTIMEOUTREQUEST4)){
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTTIMEOUTREQUEST + "\n");

                                responder(ResponseBotSounds.OUTPUTTIMEOUTREQUEST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }//(result+"").toLowerCase().contains())
                        if((result+"").toLowerCase().contains(PhrasesPLN.INPUTTIMEOUTREQUEST5)){
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTTIMEOUTREQUEST + "\n");

                                responder(ResponseBotSounds.OUTPUTTIMEOUTREQUEST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        
                        //
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDELEGATE)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDELEGATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDELEGATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDELEGATE2)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDELEGATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDELEGATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDELEGATE3)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDELEGATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDELEGATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDELEGATE4)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDELEGATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDELEGATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                       if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDELEGATE5)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDELEGATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDELEGATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        
                        //if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDIGITALCERTIFICATE))
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDIGITALCERTIFICATE)){
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDIGITALCERTIFICATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDIGITALCERTIFICATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDIGITALCERTIFICATE2)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDIGITALCERTIFICATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDIGITALCERTIFICATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDIGITALCERTIFICATE3)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDIGITALCERTIFICATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDIGITALCERTIFICATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDIGITALCERTIFICATE4)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDIGITALCERTIFICATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDIGITALCERTIFICATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTDIGITALCERTIFICATE5)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTDIGITALCERTIFICATE + "\n");
                                responder(ResponseBotSounds.OUTPUTDIGITALCERTIFICATE);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        
                        //if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTSUMPRODUCT))
                         if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTSUMPRODUCT)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTSUMPRODUCT + "\n");
                                responder(ResponseBotSounds.OUTPUTSUMPRODUCT);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTSUMPRODUCT2)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTSUMPRODUCT + "\n");
                                responder(ResponseBotSounds.OUTPUTSUMPRODUCT);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTSUMPRODUCT3)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTSUMPRODUCT + "\n");
                                responder(ResponseBotSounds.OUTPUTSUMPRODUCT);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTSUMPRODUCT4)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTSUMPRODUCT + "\n");
                                responder(ResponseBotSounds.OUTPUTSUMPRODUCT);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTSUMPRODUCT5)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTSUMPRODUCT + "\n");
                                responder(ResponseBotSounds.OUTPUTSUMPRODUCT);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //break;
                        }
                        
                        //if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTINSCESTADUAL))
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTINSCESTADUAL)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTINSCESTADUAL + "\n");
                                responder(ResponseBotSounds.OUTPUTINSCESTADUAL);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTINSCESTADUAL2)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTINSCESTADUAL + "\n");
                                responder(ResponseBotSounds.OUTPUTINSCESTADUAL);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTINSCESTADUAL3)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTINSCESTADUAL + "\n");
                                responder(ResponseBotSounds.OUTPUTINSCESTADUAL);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTINSCESTADUAL4)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTINSCESTADUAL + "\n");
                                responder(ResponseBotSounds.OUTPUTINSCESTADUAL);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTINSCESTADUAL5)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTINSCESTADUAL + "\n");
                                responder(ResponseBotSounds.OUTPUTINSCESTADUAL);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        
                        //if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCFOP))
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCFOP)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCFOP + "\n");
                                responder(ResponseBotSounds.OUTPUTCFOP);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCFOP2)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCFOP + "\n");
                                responder(ResponseBotSounds.OUTPUTCFOP);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCFOP3)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCFOP + "\n");
                                responder(ResponseBotSounds.OUTPUTCFOP);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCFOP4)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCFOP + "\n");
                                responder(ResponseBotSounds.OUTPUTCFOP);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCFOP5)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCFOP + "\n");
                                responder(ResponseBotSounds.OUTPUTCFOP);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        
                        //if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCST))
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCST))  {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCST + "\n");
                                responder(ResponseBotSounds.OUTPUTCST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCST2)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCST + "\n");
                                responder(ResponseBotSounds.OUTPUTCST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCST3)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCST + "\n");
                                responder(ResponseBotSounds.OUTPUTCST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCST4)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCST + "\n");
                                responder(ResponseBotSounds.OUTPUTCST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains(PhrasesPLN.INPUTCST5)) {
                            try {
                                ChatScreen.textVoice.append("-> " + ResponseBotSounds.OUTPUTCST + "\n");
                                responder(ResponseBotSounds.OUTPUTCST);
                                result = null;
                                perguntou = true;
                                parar();
                                timer.schedule(task, delay);
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        
                        //if ((result+"").toLowerCase().contains("parar"))
                        if ((result+"").toLowerCase().contains("tchau")){
                            try {
                                responder("Estou grato por tirar suas duvidas, até a próxima!");
                                result = null;

                                perguntou = true;
                                parar();
                                //timer.schedule(task, delay);
                                //break;
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
                        if ((result+"").toLowerCase().contains("Boa noite")){
                            try {
                                responder("Boa noite senhor, sou Delia, no que posso ajudar?");
                                result = null;

                                perguntou = true;
                                parar();
                                //timer.schedule(task, delay);
                                //break;
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //break;
                        }
//                        default:{
//                            try {
//                                ChatScreen.textVoice.append("-> "+ResponseBotSounds.OUTPUTDEFAULT+"\n");
//                                responder(ResponseBotSounds.OUTPUTDEFAULT);
//                                result = null;
//                                perguntou = true;
//                                parar();
//                                timer.schedule(task, delay);
//                            } catch (JavaLayerException ex) {
//                                Logger.getLogger(ServerBotSounds.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                            //break;
//                        }
                }

            }

            @Override
            public void onResponse(GoogleResponse paramGoogleResponse) {
                throw new UnsupportedOperationException("response__ " + paramGoogleResponse);
            }
        };

        // Parametro verdadeiro é para mostrar a interface.
        chatBot.ini(false);
        chatBot.iniciar();
    }

    private static void responder(String text) throws JavaLayerException {
        SynthesiserV2 synthesiserV2 = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");
        synthesiserV2.setLanguage("pt-br");

        System.out.println("A linguagem utilizada pelo Sintetizador é: " + synthesiserV2.getLanguage());
        try {
            InputStream audio = synthesiserV2.getMP3Data(text);
            // converte este texto para um arquivo .mp3, na pasta raiz
            String soundFile = "./adejair_load_sound.mp3";
            FileOutputStream outStream = new FileOutputStream(soundFile);

            int read = 0;
            byte[] bytes = new byte[8192];

            // Salva o arquivo mp3.
            while ((read = audio.read(bytes)) != -1) {
                outStream.write(bytes, 0, read);
            }

            FileInputStream fileInputStream = new FileInputStream(soundFile);
            Player player = new Player(fileInputStream);
            player.play();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro " + e);
        }
    }
}
