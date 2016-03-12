package com.googlemais.jocsa.googlemais;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class apresentacaoActivity extends AppCompatActivity {

    private Button bt;
    private int telaApresentada = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        this.bt = (Button) findViewById(R.id.btPrincipalNext);

    }

    /*CHAMADA DO MÉTODO MUDAR TELA*/
    public void proximaTela(View view) {
        this.mudarTela();
    }

    public void voltarTela(View view){
        if(this.telaApresentada > 1) {
            this.telaApresentada -= 2;
        }
        this.mudarTela();
    }

    /*INÍCIO DO MÉTODO PARA MUDANÇA DE TELAS*/
    private void mudarTela(){

        /*TELA 1*/
            if(this.telaApresentada==1){
            /*SETAR VISIBILIDADE COMO GONE CASO O USUÁRIO VOLTE DA TELA 2 PARA A TELA 1*/
                RelativeLayout rlbt  = (RelativeLayout) findViewById(R.id.rlButtonPrevious);
                rlbt.setVisibility(View.GONE);

                this.telaApresentada++;
                RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rlPreparacao);
                rl1.setVisibility(View.GONE);
                /*QUANDO CLICO NO BOLTAR DE VOLTAR, TENHO QUE SETAR A PROPRIEDADE VISIBILITY COMO GONE PRA O POSTERIOR TAMBÉM*/
                RelativeLayout rlvoltando = (RelativeLayout) findViewById(R.id.rl2);
                rlvoltando.setVisibility(View.GONE);

                RelativeLayout fl = (RelativeLayout) findViewById(R.id.rl1);
                fl.setVisibility(View.VISIBLE);


            /*LAYOUT PADRÃO DO BOTÃO, REDEFININDO ID DO LAYOUT_BELOW*/
                this.bt.setText("Próximo");
                RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlButton);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                layoutParams.addRule(RelativeLayout.BELOW, R.id.rl1);
                rl2.setLayoutParams(layoutParams);


        /*TELA 2*/
            }else if(this.telaApresentada==2){
                this.telaApresentada++;
                RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl1);
                rl1.setVisibility(View.GONE);
                /*QUANDO CLICO NO BOLTAR DE VOLTAR, TENHO QUE SETAR A PROPRIEDADE VISIBILITY COMO GONE PRA O POSTERIOR TAMBÉM*/
                RelativeLayout rlvoltando = (RelativeLayout) findViewById(R.id.rl3);
                rlvoltando.setVisibility(View.GONE);

                RelativeLayout fl = (RelativeLayout) findViewById(R.id.rl2);
                fl.setVisibility(View.VISIBLE);

                RelativeLayout rlbt  = (RelativeLayout) findViewById(R.id.rlButtonPrevious);
                rlbt.setVisibility(View.VISIBLE);

            /*LAYOUT PADRÃO DO BOTÃO, REDEFININDO ID DO LAYOUT_BELOW*/
                this.bt.setText("Próximo");
                RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlButton);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                layoutParams.addRule(RelativeLayout.BELOW, R.id.rl2);
                rl2.setLayoutParams(layoutParams);

        /*TELA 3*/
            }else if(this.telaApresentada==3){
                this.telaApresentada++;

                RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl2);
                rl1.setVisibility(View.GONE);
                /*QUANDO CLICO NO BOLTAR DE VOLTAR, TENHO QUE SETAR A PROPRIEDADE VISIBILITY COMO GONE PRA O POSTERIOR TAMBÉM*/
                RelativeLayout rlvoltando = (RelativeLayout) findViewById(R.id.rl4);
                rlvoltando.setVisibility(View.GONE);

                RelativeLayout fl = (RelativeLayout) findViewById(R.id.rl3);
                fl.setVisibility(View.VISIBLE);

            /*LAYOUT PADRÃO DO BOTÃO, REDEFININDO ID DO LAYOUT_BELOW*/
                this.bt.setText("Próximo");
                RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlButton);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                layoutParams.addRule(RelativeLayout.BELOW, R.id.rl3);
                rl2.setLayoutParams(layoutParams);

            }else if(this.telaApresentada==4){
                this.telaApresentada++;
                RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl3);
                rl1.setVisibility(View.GONE);
                /*QUANDO CLICO NO BOLTAR DE VOLTAR, TENHO QUE SETAR A PROPRIEDADE VISIBILITY COMO GONE PRA O POSTERIOR TAMBÉM*/
                RelativeLayout rlvoltando = (RelativeLayout) findViewById(R.id.rl5);
                rlvoltando.setVisibility(View.GONE);

                RelativeLayout fl = (RelativeLayout) findViewById(R.id.rl4);
                fl.setVisibility(View.VISIBLE);

            /*LAYOUT PADRÃO DO BOTÃO, REDEFININDO ID DO LAYOUT_BELOW*/
                this.bt.setText("Próximo");
                RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlButton);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                layoutParams.addRule(RelativeLayout.BELOW, R.id.rl4);
                rl2.setLayoutParams(layoutParams);

            }else if(this.telaApresentada==5){
                this.telaApresentada++;
                RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl4);
                rl1.setVisibility(View.GONE);

                RelativeLayout fl = (RelativeLayout) findViewById(R.id.rl5);
                fl.setVisibility(View.VISIBLE);

            /*LAYOUT PADRÃO DO BOTÃO, REDEFININDO ID DO LAYOUT_BELOW*/
                this.bt.setText("Início");
                RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlButton);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                layoutParams.addRule(RelativeLayout.BELOW, R.id.rl5);
                rl2.setLayoutParams(layoutParams);

            }else if(this.telaApresentada==6){
                this.telaApresentada = 1;

                RelativeLayout rlbt  = (RelativeLayout) findViewById(R.id.rlButtonPrevious);
                rlbt.setVisibility(View.GONE);

                RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl5);
                rl1.setVisibility(View.GONE);

                RelativeLayout fl = (RelativeLayout) findViewById(R.id.rlPreparacao);
                fl.setVisibility(View.VISIBLE);

            /*LAYOUT PADRÃO DO BOTÃO, REDEFININDO ID DO LAYOUT_BELOW*/
                this.bt.setText("Início");
                RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlButton);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                layoutParams.addRule(RelativeLayout.BELOW, R.id.rlPreparacao);
                rl2.setLayoutParams(layoutParams);

            }else{
                Toast.makeText(this, "Houve um erro na aplicação... Desculpe!", Toast.LENGTH_LONG).show();
            }

    }
    /*FIM DO MÉTODO PARA MUDANÇA DE TELAS*/


}
