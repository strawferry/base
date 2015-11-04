package org.forkjoin.apikit.builder;

import org.forkjoin.apikit.Config;
import org.forkjoin.apikit.model.ModelInfo;
import org.forkjoin.apikit.model.ModuleInfo;

/**
 * @author zuoge85 on 15/6/15.
 */
public class JavaUtils extends BuilderUtils{
    public JavaUtils(Config config, ModelInfo modelInfo, ModuleInfo moduleInfo, String rootPackage) {
        super(config, modelInfo, moduleInfo, rootPackage);
    }
}