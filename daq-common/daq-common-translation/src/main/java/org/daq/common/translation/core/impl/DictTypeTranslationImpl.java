package org.daq.common.translation.core.impl;

import org.daq.common.core.service.DictService;
import org.daq.common.core.utils.StringUtils;
import org.daq.common.translation.annotation.TranslationType;
import org.daq.common.translation.constant.TransConstant;
import org.daq.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;

/**
 * 字典翻译实现
 *
 * @author daq
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.DICT_TYPE_TO_LABEL)
public class DictTypeTranslationImpl implements TranslationInterface<String> {

    private final DictService dictService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof String dictValue && StringUtils.isNotBlank(other)) {
            return dictService.getDictLabel(other, dictValue);
        }
        return null;
    }
}
