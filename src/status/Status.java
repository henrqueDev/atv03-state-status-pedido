package status;

// Status interface
public interface Status {
    String onPreparacao();
    String onTransporte();
    String onRecebido();
    String onFinalizado();
}
