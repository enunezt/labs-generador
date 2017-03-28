/*******************************************************************************
 * Copyright (c) 2008, 2014 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Stephane Begaudeau (Obeo) - initial API and implementation
 *******************************************************************************/
package com.intermacs.generador.codigo.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.intermacs.generador.codigo.constantes.IConstantesGenerador;

/**
 * This class contains the properties of the generation.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 2.0
 */
public class ConfigurationHolder extends AdapterImpl {

    /**
     * The map containing the parameters of the generation.
     */
    private Map<String, Object> configuration = new HashMap<String, Object>();

    /**
     * Puts a new entry into the configuration.
     *
     * @param key
     *            The key of the entry
     * @param value
     *            The value of the entry
     */
    public void put(String key, Object value) {
        this.configuration.put(key, value);
    }

        
    /**
     * Returns nombre de paquetes de organización
     *
     * @param eObject
     *            The model element
     * @return nombre de paquetes de organización
     */
    public static String getBaseFolder() {
        return IConstantesGenerador.DefaultValue.VALUE_BASE_FOLDER;
    }

    /**
     * Returns the default project name.
     *
     * @param eObject
     *            The model element
     * @return The default project name.
     */
    public static String getDefaultProjectName(/*EObject eObject*/) {
        return IConstantesGenerador.DEFAULT_PROJECT_NAME;// ConfigurationHolder.getStringValue(eObject, IConstantesGenerador.DEFAULT_PROJECT_NAME);
    }

    /**
     * Returns the configuration holder for the given model element.
     *
     * @param eObject
     *            The model element
     * @return The configuration holder for the given model element.
     */
    private static ConfigurationHolder getConfigurationHolder(EObject eObject) {
        Resource eResource = eObject.eResource();
        EObject rootEObject = eResource.getContents().get(0);

        List<Adapter> eAdapters = rootEObject.eAdapters();
        for (Adapter adapter : eAdapters) {
            if (adapter instanceof ConfigurationHolder) {
                return (ConfigurationHolder)adapter;
            }
        }

        return null;
    }

    /**
     * Returns a string value from the given key.
     *
     * @param eObject
     *            The model element
     * @param key
     *            The key
     * @return A string value from the given key.
     */
    private static String getStringValue(EObject eObject, String key) {
        ConfigurationHolder configurationHolder = ConfigurationHolder
                .getConfigurationHolder(eObject);
        if (configurationHolder != null) {
            Object object = configurationHolder.getValue(key);
            if (object instanceof String) {
                return (String)object;
            }
        }
        return "";
    }

    /**
     * Returns a boolean value from the given key.
     *
     * @param eObject
     *            The model element
     * @param key
     *            The key
     * @return A boolean value from the given key.
     */
    private static boolean getBooleanValue(EObject eObject, String key) {
        boolean result = false;
        ConfigurationHolder configurationHolder = ConfigurationHolder
                .getConfigurationHolder(eObject);
        if (configurationHolder != null) {
            Object object = configurationHolder.getValue(key);
            if (object instanceof String) {
                result = Boolean.valueOf((String)object).booleanValue();
            } else if (object instanceof Boolean) {
                result = ((Boolean)object).booleanValue();
            }
        }
        return result;
    }

    /**
     * Returns a list of strings from the given key.
     *
     * @param eObject
     *            The model element
     * @param key
     *            The key
     * @return A list of strings from the given key.
     */
    private static List<String> getStringListValue(EObject eObject, String key) {
        List<String> packages = new ArrayList<String>();

        ConfigurationHolder configurationHolder = ConfigurationHolder
                .getConfigurationHolder(eObject);
        if (configurationHolder != null) {
            Object object = configurationHolder.getValue(key);
            if (object instanceof String) {
                String str = (String)object;

                StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    String trim = nextToken.trim();
                    if (trim.length() > 0) {
                        packages.add(trim);
                    }
                }
            }
        }
        return packages;
    }

    /**
     * Returns a value for the given key.
     *
     * @param key
     *            The key
     * @return A value for the given key.
     */
    public Object getValue(String key) {
        return this.configuration.get(key);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
     */
    @Override
    public boolean isAdapterForType(Object type) {
        return type == ConfigurationHolder.class;
    }
}
