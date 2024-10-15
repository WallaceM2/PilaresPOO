package Equipamentos.estabelecimento;

import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Deskjet;
import Equipamentos.impressora.Impressora;
import Equipamentos.impressora.laser;
import Equipamentos.multifuncional.EquipamentoFuncional;
import Equipamentos.Copiadora.Copiadora;

public class Fabrica {
        public static void main(String[] args) {

                EquipamentoFuncional em = new EquipamentoFuncional();

                Deskjet deskjet = new Deskjet();
                Impressora impressora = deskjet ;
                Digitalizadora digitalizadora = em;
                Copiadora copiadora = em;

                

            impressora.imprimir();
            digitalizadora.digitar();
            copiadora.copiar();
        }
}
