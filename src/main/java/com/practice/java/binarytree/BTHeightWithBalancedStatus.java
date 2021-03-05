package com.practice.java.binarytree;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BTHeightWithBalancedStatus {

    private Integer height;

    private boolean isBalanced;
}
