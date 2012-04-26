package the.factory.method.pattern.framework;

/**
 * <h1>工場を表すクラス</h1>
 * <p>FactoryMethodパターンの心臓部で、TemplateMethodパターンが使用されている。<p>
 * @author shimosuk
 *
 */
public abstract class Factory {

    /**
     * <h1>製品を作って登録するメソッド<h1>
     * <p>Productクラスのインスタンスを生成する</p>
     * <p>abstractクラスで実装している(FactoryMethodパターン)</p>
     * @param owner
     * @return
     */
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    /**
     * <h1>製品を作るためのメソッド</h1>
     * <p>抽象メソッドで実装され、createメソッドで呼び出される</p>
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     * <h1>製品登録のためのメソッド</h1>
     * <p>抽象メソッドで実装され、createメソッドで呼び出される</p>
     * @param product
     */
    protected abstract void registerProduct(Product product);
}
