package com.wallet.transaction.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TxnStatusDto {
    private String status;
    private String reason;
}
