package hello.itemservice.message;

import jakarta.annotation.Nullable;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

public interface MessageSource {

    String getMessage(String code, @Nullable Object[] args, @Nullable String defaultMessage, Locale locale);
    String getMessage(String code, @Nullable Object[] args, Locale locale) throws NoSuchMessageException;
}
