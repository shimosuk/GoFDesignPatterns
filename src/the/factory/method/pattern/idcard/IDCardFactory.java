package the.factory.method.pattern.idcard;

import the.factory.method.pattern.framework.Factory;
import the.factory.method.pattern.framework.Product;

public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return null;
    }

    @Override
    protected void registerProduct(Product product) {
    }

}
