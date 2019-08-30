/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geradorcodigoautohotkey_planilhaparahistsigaa;

/**
 *
 * @author Serac02
 */
public class alunoSigaa {
    
    private String formaDeIngresso1;
    private String curso2;
    private String NprocessoSeletivo3;
    private String cota4;
    private String trabalha5;
    private String cpf6;
    private String nome7;
    private String pai8;
    private String mae9;
    private String sexo10;
    
    private String nascimento11;
    private String estadoCivil12;
    private String raca13;
    private String sangue14;
    private String escolaridade15;
    private String escolaridadeAnoConc16;
    private String naturalidadePais17;
    private String naturalidadeEstado18;
    private String naturalidadeMunicipio19;
    private String rg20;
    
    private String rgOrgaoExp21;
    private String rgEstado22;
    private String rgDataExp23;
    private String tituloEleitor24;
    private String tituloZona25;
    private String tituloSecao26;
    private String cep27;
    private String ResLogrodouro28;
    private String ResNumero29;
    private String bairro30;
    
    private String ResComplemento31;
    private String ResMunicipio32; 
    private String TelFixo33;
    private String ResEstado34;
    private String TelCelular35;
    private String TelOutro36;
    private String Email37;
    private String NecEspecial38;
    private String ResponsavelNome39;
    private String ResponsavelCpf40;
    
    private String ResponsavelParentesco41;
    private String turno42;

    String codigoAHK="";
    
    public void relatorio(){
    System.out.println("Nome: "+nome7+"; Mae: "+mae9+"; Raca "+raca13);
    
    }
    
    
    public String getFormaDeIngresso1() {
        return formaDeIngresso1;
    }

    public void setFormaDeIngresso1(String formaDeIngresso1) {
        this.formaDeIngresso1 = formaDeIngresso1;
    }

    public String getCurso2() {
        return curso2;
    }

    public void setCurso2(String curso2) {
        this.curso2 = curso2;
    }

    public String getNprocessoSeletivo3() {
        return NprocessoSeletivo3;
    }

    public void setNprocessoSeletivo3(String NprocessoSeletivo3) {
        this.NprocessoSeletivo3 = NprocessoSeletivo3;
    }

    public String getCota4() {
        return cota4;
    }

    public void setCota4(String cota4) {
        this.cota4 = cota4;
    }

    public String getTrabalha5() {
        return trabalha5;
    }

    public void setTrabalha5(String trabalha5) {
        this.trabalha5 = trabalha5;
    }

    public String getCpf6() {
        return cpf6.replace(".", "").replace("-", "");
    }
    
    public boolean isSexoMasculino(){
    return sexo10.equals("M");
    }
    
    public boolean informouSangue()
    {
    return sangue14.length()>0;
    }

    public boolean naoNasceuNoParana(){
    return !naturalidadeEstado18.equals("PR");
    }
    
    public void setCpf6(String cpf6) {
        this.cpf6 = cpf6;
    }

    public String getNome7() {
        return nome7;
    }

    public void setNome7(String nome7) {
        this.nome7 = nome7;
    }

    public String getPai8() {
        return pai8;
    }
    
    public boolean informouPai(){
        return pai8.length()>0;
    }
    

    public void setPai8(String pai8) {
        this.pai8 = pai8;
    }

    public String getMae9() {
        return mae9;
    }

    public void setMae9(String mae9) {
        this.mae9 = mae9;
    }

    public String getSexo10() {
        return sexo10;
    }

    public void setSexo10(String sexo10) {
        this.sexo10 = sexo10;
    }

    public String getNascimento11() {
        return nascimento11;
    }

    public void setNascimento11(String nascimento11) {
        this.nascimento11 = nascimento11;
    }

    public String getEstadoCivil12() {
        return estadoCivil12;
    }

    public void setEstadoCivil12(String estadoCivil12) {
        this.estadoCivil12 = estadoCivil12;
    }

    public String getRaca13() {
        return raca13;
    }

    public void setRaca13(String raca13) {
        this.raca13 = raca13;
    }

    public String getSangue14() {
        return sangue14;
    }

    public void setSangue14(String sangue14) {
        this.sangue14 = sangue14;
    }

    public String getEscolaridade15() {
        return escolaridade15;
    }

    public void setEscolaridade15(String escolaridade15) {
        this.escolaridade15 = escolaridade15;
    }

    public String getEscolaridadeAnoConc16() {
        return escolaridadeAnoConc16;
    }
    
    public boolean informouAnoEscolaridade(){
        return escolaridadeAnoConc16.length()>1;
    }

    public void setEscolaridadeAnoConc16(String escolaridadeAnoConc16) {
        this.escolaridadeAnoConc16 = escolaridadeAnoConc16;
    }

    public String getNaturalidadePais17() {
        return naturalidadePais17;
    }

    public void setNaturalidadePais17(String naturalidadePais17) {
        this.naturalidadePais17 = naturalidadePais17;
    }

    public String getNaturalidadeEstado18() {
        return naturalidadeEstado18;
    }

    public void setNaturalidadeEstado18(String naturalidadeEstado18) {
        this.naturalidadeEstado18 = naturalidadeEstado18;
    }

    public String getNaturalidadeMunicipio19() {
        return naturalidadeMunicipio19;
    }

    public void setNaturalidadeMunicipio19(String naturalidadeMunicipio19) {
        this.naturalidadeMunicipio19 = naturalidadeMunicipio19;
    }

    public String getRg20() {
        return rg20;
    }

    public boolean informouRg(){
        return rg20.length()>1;
    }
    
    public void setRg20(String rg20) {
        this.rg20 = rg20;
    }

    public String getRgOrgaoExp21() {
        return rgOrgaoExp21;
    }
    
   

    public void setRgOrgaoExp21(String rgOrgaoExp21) {
        this.rgOrgaoExp21 = rgOrgaoExp21;
    }

    public String getRgEstado22() {
        return rgEstado22;
    }

    public void setRgEstado22(String rgEstado22) {
        this.rgEstado22 = rgEstado22;
    }

    public String getRgDataExp23() {
        return rgDataExp23;
    }

    public void setRgDataExp23(String rgDataExp23) {
        this.rgDataExp23 = rgDataExp23;
    }

    public boolean informouDataExpRg(){
        return rgDataExp23.length()>1;
    }
    
    public String getTituloEleitor24() {
        return tituloEleitor24;
    }
    
    public boolean informouTituloEleitor(){
        return tituloEleitor24.length()>1;
    }

    public void setTituloEleitor24(String tituloEleitor24) {
        this.tituloEleitor24 = tituloEleitor24;
    }

    public String getTituloZona25() {
        return tituloZona25;
    }

    public void setTituloZona25(String tituloZona25) {
        this.tituloZona25 = tituloZona25;
    }

    public String getTituloSecao26() {
        return tituloSecao26;
    }

    public void setTituloSecao26(String tituloSecao26) {
        this.tituloSecao26 = tituloSecao26;
    }

    public String getCep27() {
        return cep27;
    }
    
    public boolean informouCep(){
        return cep27.length()>4;
    }
    
    public void setCep27(String cep27) {
        this.cep27 = cep27;
    }

    public String getResLogrodouro28() {
        return ResLogrodouro28;
    }
    
    public boolean informouRua(){
        return ResLogrodouro28.length()>4;
    }
    

    public void setResLogrodouro28(String ResLogrodouro28) {
        this.ResLogrodouro28 = ResLogrodouro28;
    }

    public String getResNumero29() {
        return ResNumero29;
    }

    public void setResNumero29(String ResNumero29) {
        this.ResNumero29 = ResNumero29;
    }

    public String getBairro30() {
        return bairro30;
    }

    public boolean informouBairro(){
        return bairro30.length()>1;
    }
    
    public void setBairro30(String bairro30) {
        this.bairro30 = bairro30;
    }

    public String getResComplemento31() {
        return ResComplemento31;
    }

    public void setResComplemento31(String ResComplemento31) {
        this.ResComplemento31 = ResComplemento31;
    }

    public String getResMunicipio32() {
        return ResMunicipio32;
    }

    public void setResMunicipio32(String ResMunicipio32) {
        this.ResMunicipio32 = ResMunicipio32;
    }

    public String getDDDTel1(){
        if(TelFixo33.length()<3 && TelOutro36.length()>3)
            return TelOutro36.substring(0,2);
        else if (TelOutro36.length()<3)
            return "00";
        
        return TelFixo33.substring(0,2);
    }
    
    public String getDDDTel2(){
        if(TelCelular35.length()>1)
        return TelCelular35.substring(0, 2);
        else
            return "00";
    }
    
    public String getTel2(){
         if(TelCelular35.length()>1)
        return TelCelular35.substring(3);
         else
            return "0";
    }
    
    public String getTel1(){
        
        if(TelFixo33.length()<3 && TelOutro36.length()>3)
            return TelOutro36.substring(3);
         else if (TelOutro36.length()<3)
            return "0";
        
       return TelFixo33.substring(3);
    }
    
    public String getTelFixo33() {
        return TelFixo33;
    }

    public void setTelFixo33(String TelFixo33) {
        this.TelFixo33 = TelFixo33;
    }
    
    public boolean temDeficiencia(){
        return !NecEspecial38.equals("Não");
    }

    public String getResEstado34() {
        return ResEstado34;
    }

    public void setResEstado34(String ResEstado34) {
        this.ResEstado34 = ResEstado34;
    }

    public String getTelCelular35() {
        return TelCelular35;
    }

    public void setTelCelular35(String TelCelular35) {
        this.TelCelular35 = TelCelular35;
    }

    public String getTelOutro36() {
        return TelOutro36;
    }

    public void setTelOutro36(String TelOutro36) {
        this.TelOutro36 = TelOutro36;
    }

    public String getEmail37() {
        return Email37;
    }

    public boolean informouEmail(){
        return Email37.length()>1;
    }
    
    public void setEmail37(String Email37) {
        this.Email37 = Email37;
    }

    public String getNecEspecial38() {
        return NecEspecial38;
    }

    public void setNecEspecial38(String NecEspecial38) {
        this.NecEspecial38 = NecEspecial38;
    }

    public String getResponsavelNome39() {
        return ResponsavelNome39;
    }

   
    
    public void setResponsavelNome39(String ResponsavelNome39) {
        this.ResponsavelNome39 = ResponsavelNome39;
    }

    public String getResponsavelCpf40() {
        return ResponsavelCpf40;
    }

    public void setResponsavelCpf40(String ResponsavelCpf40) {
        this.ResponsavelCpf40 = ResponsavelCpf40;
    }

    public String getResponsavelParentesco41() {
        return ResponsavelParentesco41;
    }

    public void setResponsavelParentesco41(String ResponsavelParentesco41) {
        this.ResponsavelParentesco41 = ResponsavelParentesco41;
    }

    public String getTurno42() {
        return turno42;
    }

    public void setTurno42(String turno42) {
        this.turno42 = turno42;
    }

    String getNomeEstadoNaturalidade(){
    return NomeEstado(naturalidadeEstado18);
    }
    
    String getNomeEstadoRg(){
    return NomeEstado(rgEstado22);
    }
    
    
    String NomeEstado(String est) {
       
        if(est.equals("SP"))
            return "São Paulo";
        if(est.equals("SC"))
            return "Santa Catarina";
        if(est.equals("BA"))
            return "Bahia";
        if(est.equals("MG"))
            return "Minas Gerais";
        if(est.equals("RJ"))
            return "Rio";
        if(est.equals("RS"))
            return "Rio Grande do Sul";
        if(est.equals("MT"))
            return "Mato Grosso";
        if(est.equals("MS"))
            return "Mato Grosso do Sul";
        if(est.equals("AC"))
            return "Acre";
        if(est.equals("AL"))
            return "Alagoas";
        if(est.equals("AP"))
            return "Amap";
        if(est.equals("AM"))
            return "Amazonas";
        if(est.equals("CE"))
            return "Cear";
        if(est.equals("DF"))
            return "Distrito Federal";
        if(est.equals("ES"))
            return "Esp";
        if(est.equals("GO"))
            return "Goi";
        if(est.equals("MA"))
            return "Maranh";
        if(est.equals("PA"))
            return "Par";
        if(est.equals("PB"))
            return "Para";
        if(est.equals("PE"))
            return "Pernambuco";
        if(est.equals("PI"))
            return "Piau";
        if(est.equals("RO"))
            return "Rond";
        if(est.equals("RR"))
            return "Roraima";
        if(est.equals("SE"))
            return "Sergipe";
        if(est.equals("TO"))
            return "Tocantins";
        
        return "nao cad";
    }

    boolean naoEhBrasileiro() {
       return !naturalidadePais17.equals("Brasil");
    }

    boolean naoFezRgNoParana() {
        return !rg20.equals("PR");
    }

    void setCodigo(String cod) {
        codigoAHK = cod;
    }

    void criarArquivoAHK(jan j) {
        CriarArquivo ca = new CriarArquivo(j);
        ca.salvar(codigoAHK, nome7, curso2,turno42);
    }
    
   
    
}
