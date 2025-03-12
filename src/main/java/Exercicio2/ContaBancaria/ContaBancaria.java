    package Exercicio2.ContaBancaria;

    import java.util.Scanner;

    public class ContaBancaria {
        private String titular;
        private double saldo;

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public Boolean ConfirmacaoDeposito(char confirmacaoDeposito){
            boolean resposta;
            if (confirmacaoDeposito == 's') {
                return resposta = true;
            }
            else {
                return resposta = false;
            }
        }

        public Boolean ConfirmacaoSaque(char confirmacaoSaque){
            boolean resposta;
            if (confirmacaoSaque == 's') {
                return resposta = true;
            }
            else {
                return resposta = false;
            }
        }

        public void Depositar(Boolean confirmacaoDeposito){
            Scanner sc = new Scanner(System.in);
            if (confirmacaoDeposito){
                System.out.print("Valor: ");
                double depositar = sc.nextDouble();
                this.saldo += depositar;

            }
        }

        public void Sacar(Boolean confirmacaoSaque){
            Scanner sc = new Scanner(System.in);
            if (confirmacaoSaque == true){
                System.out.print("Valor: ");
                double saque = sc.nextDouble();
                if (saque <= saldo){
                    this.saldo -=  saque;
                }
            }
        }



    }
