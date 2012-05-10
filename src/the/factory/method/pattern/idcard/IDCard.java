package the.factory.method.pattern.idcard;

import the.factory.method.pattern.framework.Product;

/**
 * <h1>認識番号カードを表すクラス</h1>
 * @author shimosuk
 *
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }

    public String getName() {
        return owner;
    }
}
