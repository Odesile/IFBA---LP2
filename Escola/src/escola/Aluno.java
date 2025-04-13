package escola;
    public class Aluno {
        private float[] notas = new float[2];
        private float nota_trabalho;
        private int matricula;
        private float media;
        
        
        //Get das notas
        public float[] getNotas(){
            return notas;
        }
     
        
        //Set das notas 2       
        public void setNotas(float[] notas){
            for (int i = 0; i < 2; i++) {
                this.notas[i] = notas[i];
            }
        }
        
        
        //Get e Set do trabalho
        public float getNota_trabalho(){
            return this.nota_trabalho;
        }
        public void setNota_trabalho(float nota){
            this.nota_trabalho = nota;
        }
        
        
        //Get e Set da matricula
        public int getMatricula(){
            return this.matricula;
        }
        public void setMatricula(int matricula){
            this.matricula = matricula;
        }
        
        
        //Get e Set da média
        public float getMedia(){
            return this.media;
        }
        
        public void setMedia(float med){
            this.media = med;
        }
        
        public void mostra_media(){
            System.out.println("A média do aluno foi: "+this.media);
        }
        public boolean mostra_aprovacao(){
            if (this.media >= 6) {
                System.out.println("Aprovado!!!");
                return true;
            }else{
                System.out.println("Reprovado!");
                return false;
            }
        }
        
    }


