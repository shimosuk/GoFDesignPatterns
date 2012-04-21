package theComposite;

/**
 * <h1>ファイルクラスに対してaddした際に投げるエラー</h1>
 * <p>Javaのクラスライブラリで提供されているものではなく、自作のエラー</p>
 * @author shimosuk
 *
 */
public class FileTreatmentException extends RuntimeException {

    /**
     * <h1>送り側と受け側で同じクラスかどうか判別するための値</h1>
     * <p>オブジェクトの serialize を行う場合に、 serialVersionUID を設定する必要がある場合がある</p>
     */
    private static final long serialVersionUID = 1L;

    public FileTreatmentException() {}

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
