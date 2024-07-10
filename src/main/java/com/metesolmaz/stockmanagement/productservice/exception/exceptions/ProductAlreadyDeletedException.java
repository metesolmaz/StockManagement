package com.metesolmaz.stockmanagement.productservice.exception.exceptions;

import com.metesolmaz.stockmanagement.productservice.enums.Language;
import com.metesolmaz.stockmanagement.productservice.exception.enums.IFriendlyMessageCode;
import com.metesolmaz.stockmanagement.productservice.exception.utils.FriendlyMessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ProductAlreadyDeletedException extends RuntimeException{
    private final Language language;
    private final IFriendlyMessageCode friendlyMessageCode;

    public ProductAlreadyDeletedException(Language language, IFriendlyMessageCode friendlyMessageCode, String message) {
        super(FriendlyMessageUtils.getFriendlyMessage(language, friendlyMessageCode));
        this.language = language;
        this.friendlyMessageCode = friendlyMessageCode;
        log.error("[ProductAlreadyDeletedException] -> message: {} developer message: {}",FriendlyMessageUtils.getFriendlyMessage(language,friendlyMessageCode), message);
    }
}
