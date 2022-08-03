public class Robo {
    
        private Comportamento comportamento;

        public void setComportamento(Comportamento compo){
            this.comportamento = compo;
        }

        public void mover(){
            comportamento.mover();
        }

    
}
