package br.com.dbccompany.vemser.avaliaser.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DashboardAminPage extends BasePage{

    private static final By textDashboardAdmin = By.cssSelector("#root > div.MuiBox-root.css-1u4uuh3 > h3");
    private static final By msgBoasVindas = By.cssSelector("#boas-vindas-admin");
    private static final By btnMenu = By.cssSelector("#root > header > div > div > div.MuiBox-root.css-14knnik > button");
    private static final By btnDashboard =
            By.cssSelector("#menu-visible > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded." +
                    "MuiPaper-elevation1.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded." +
                    "MuiPaper-elevation8.MuiPopover-paper.css-177ic5c > ul > li:nth-child(1)");
    private static final By btnCadastrarColaborador =
            By.cssSelector("#menu-visible > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded." +
                    "MuiPaper-elevation1.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded." +
                    "MuiPaper-elevation8.MuiPopover-paper.css-177ic5c > ul > li:nth-child(3)");
    private static final By btnEditarColaborador = By.cssSelector("#botao-editar-admin-1");
    private static final By btnDeletarColaborador = By.cssSelector("#botao-deletar-admin-1");
    private static final By btnConfirmarDeletar = By.cssSelector("#botao-confirmar-modal");
    private static final By msgColaboradorDeletado = By.cssSelector("#\\32  > div.Toastify__toast-body > div:nth-child(2)");
    private static final By btnFotoPerfil = By.cssSelector("#menu-avatar-admin");
    private static final By btnTrocarSenha = By.cssSelector("#menu-appbar > div.MuiPaper-root.MuiPaper-elevation." +
            "MuiPaper-rounded.MuiPaper-elevation1.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded." +
            "MuiPaper-elevation8.MuiPopover-paper.css-177ic5c > ul > li:nth-child(1)");
    private static final By btnEditar = By.cssSelector("#menu-appbar > div.MuiPaper-root.MuiPaper-elevation." +
            "MuiPaper-rounded.MuiPaper-elevation1.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded." +
            "MuiPaper-elevation8.MuiPopover-paper.css-177ic5c > ul > li:nth-child(3)");
    private static final By btnSair = By.cssSelector("#menu-appbar > div.MuiPaper-root.MuiPaper-elevation." +
            "MuiPaper-rounded.MuiPaper-elevation1.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded." +
            "MuiPaper-elevation8.MuiPopover-paper.css-177ic5c > ul > li:nth-child(5)");

    @Step("Validar título de página Dashboard Admin")
    public String validarTextoDashboardAdmin(){
        return getText(textDashboardAdmin);
    }

    @Step("Validar mensagem de boas vindas Admin")
    public String validarMensagemDeBoasVindasAdmin(){
        return getText(msgBoasVindas);
    }

    @Step("Clicar no botão Menu")
    public void clicarBtnMenu(){
        click(btnMenu);
    }

    @Step("Clicar no botão Dashboard")
    public void clicarBtnDashboard(){
        click(btnDashboard);
    }

    @Step("Clicar no botão Cadastrar Colaborador")
    public void clicarBtnCadastrarColaborador(){
        click(btnCadastrarColaborador);
    }

    @Step("Clicar no botão Editar Colaborador")
    public void clicarBtnEditarColaborador(){
        click(btnEditarColaborador);
    }

    @Step("Clicar no botão Deletar Colaborador")
    public void clicarBtnDeletarColaborador(){
        click(btnDeletarColaborador);
    }

    @Step("Clicar no botão Confirmar deletar")
    public void clicarBtnConfirmarDeletar(){
        click(btnConfirmarDeletar);
    }

    @Step("Validar mensagem de confirmação colaborador deletado")
    public String validarMensagemDeColaboradorDeletado(){
        return getText(msgColaboradorDeletado);
    }

    @Step("Clicar no botão Foto de Perfil")
    public void clicarBtnFotoPerfil(){
        click(btnFotoPerfil);
    }

    @Step("Clicar no botão Trocar Senha")
    public void clicarBtnTrocarSenha(){
        click(btnTrocarSenha);
    }

    @Step("Clicar no botão Editar")
    public void clicarBtnEditar(){
        click(btnEditar);
    }

    @Step("Clicar no botão Sair")
    public void clicarBtnSair(){
        click(btnSair);
    }

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }

}