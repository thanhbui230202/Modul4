package thanhbui.bookmanageaop.gernator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class CustomId implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        StringBuilder idBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            idBuilder.append(characters.charAt(random.nextInt(characters.length())));
        }

        for (int i = 0; i < 3; i++) {
            idBuilder.append(numbers.charAt(random.nextInt(numbers.length())));
        }

        for (int i = 0; i < 3; i++) {
            idBuilder.append(characters.charAt(random.nextInt(characters.length())));
        }

        return idBuilder.toString();
    }
}
