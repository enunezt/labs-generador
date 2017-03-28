/**
 * 
 */
package com.intermacs.generador.codigo.constantes;

import java.util.Calendar;

/**
 * @author eanunezt
 *
 */
public interface IConstantesGenerador {
	

    /**
     * The extension of the UML files.
     */
    String UML_FILE_EXTENSION = "uml";

    /**
     * The key representing the uml model path.
     */
    String UML_MODEL_PATH = "uml_model_path";

    /**
     * The nature used by PDE plugin projects.
     */
    String PDE_PLUGIN_NATURE_ID = "org.eclipse.pde.PluginNature";

    /**
     * The absolute location of the folder in which the code will be generated.
     */
    String GENERATION_ROOT_PATH = "generation_root_path";

    /**
     * The key representing the default project name.
     */
    String DEFAULT_PROJECT_NAME = "default_project_name";

    /**
     * The key representing the source folder path.
     */
    String SOURCE_FOLDER_PATH = "source_folder_path";
    
    /**
     * The key representing the base folder path.
     */
    String BASE_FOLDER = "base_folder";

    /**
     * The key representing the output folder path.
     */
    String OUTPUT_FOLDER_PATH = "output_folder_path";

    /**
     * The key representing the JRE execution environment.
     */
    String JRE_EXECUTION_ENVIRONMENT = "jre_execution_environment";

       /**
     * The key indicating if we should generate getters and setters.
     */
    String GENERATE_GETTERS_AND_SETTERS = "generate_getters_setters";

    /**
     * The key indicating if we should generate getters for collections.
     */
    String GENERATE_GETTERS_COLLECTIONS = "generate_getters_collections";

    /**
     * The key indicating if we should generate setters for collections.
     */
    String GENERATE_SETTERS_COLLECTIONS = "generate_setters_collections";

    /**
     * The key indicating if we should generate advanced accessors for collections.
     */
    String GENERATE_ADVANCED_ACCESSORS_COLLECTIONS = "generate_advanced_accessors_collections";

    /**
     * The key representing the author.
     */
    String AUTHOR = "author";

    /**
     * The key representing the version.
     */
    String VERSION = "version";

    /**
     * The key representing the copyright and the license.
     */
    String COPYRIGHT_AND_LICENSE = "copyright_license";

    /**
     * The key representing the components to ignore during the generation.
     */
    String COMPONENTS_TO_IGNORE = "components_ignore";

    /**
     * The key representing the kind of component architecture.
     */
    String COMPONENTS_ARCHITECTURE = "components_architecture";

    /**
     * The key representing the bundle provider.
     */
    String BUNDLE_PROVIDER = "bundle_provider";

    /**
     * The key representing the types to ignore during the generation.
     */
    String TYPES_TO_IGNORE_DURING_GENERATION = "types_to_ignore_during_generation";

    /**
     * The key representing the types to ignore during the imports.
     */
    String TYPES_TO_IGNORE_DURING_IMPORTS = "types_to_ignore_during_imports";

    public interface DefaultValue {

        /**
         * The default name of the project where the code will be generated.
         */
        String VALUE_PROJECT_NAME = "org.eclipse.uml.to.java";

        /**
         * The path of the default source folder.
         */
        String VALUE_SOURCE_FOLDER_PATH = "src/main/java";

        /**
         * The path of the default output folder.
         */
        String VALUE_OUTPUT_FOLDER_PATH = "target/classes";

        /**
         * The default JRE execution environment.
         */
        String VALUE_JRE_EXECUTION_ENVIRONMENT = "JavaSE-1.7";

        /**
         * The default components to ignore during the generation.
         */
        String VALUE_COMPONENTS_TO_IGNORE = "java, ";

        /**
         * The type OSGi component artifacts to generate.
         */
        String VALUE_COMPONENT_ARTIFACTS_TYPE_OSGI = "OSGi Bundles and Subsystems";

        /**
         * The type Eclipse component artifacts to generate.
         */
        String VALUE_COMPONENT_ARTIFACTS_TYPE_ECLIPSE = "Eclipse Plugins, Features and Update Sites";

        /**
         * The type Java component artifacts to generate.
         */
        String VALUE_COMPONENT_ARTIFACTS_TYPE_JAVA = "Java Projects";

        /**
         * The default bundle provider name.
         */
        String VALUE_BUNDLE_PROVIDER_NAME = "Intermac's Factory";

        /**
         * The default author.
         */
        String VALUE_AUTHOR = System.getProperty("user.name");

        /**
         * The default version.
         */
        String VALUE_VERSION = "1.0.0";

        /**
         * The default license and copyright.
         */
        String VALUE_COPYRIGHT_AND_LICENSE = Calendar.getInstance().get(Calendar.YEAR)
                + ", All rights reserved.";

        
        /**
         * The default value to indicate if we should generate getters and setters.
         */
        boolean VALUE_GENERATE_GETTERS_AND_SETTERS = true;

        /**
         * The default value to indicate if we should generate getters for collections.
         */
        boolean VALUE_GENERATE_GETTERS_COLLECTIONS = true;

        /**
         * The default value to indicate if we should generate setters for collections.
         */
        boolean VALUE_GENERATE_SETTERS_COLLECTIONS = false;

        /**
         * The default value to indicate if we should generate advanced accessors for collections.
         */
        boolean VALUE_GENERATE_ADVANCED_ACCESSORS_COLLECTIONS = false;

        /**
         * The default value to indicate if we should generate and import Java types.
         */
        boolean VALUE_IGNORE_JAVA_TYPES_DURING_GENERATION_AND_IMPORT = true;

        /**
         * The default types to ignore during the generation.
         */
        String VALUE_TYPES_TO_IGNORE_DURING_GENERATION = "";

        /**
         * The default types to ignore during the import declaration.
         */
        String VALUE_TYPES_TO_IGNORE_DURING_IMPORTS = "";
        /**
         * The key representing the base folder path.
         */
        String VALUE_BASE_FOLDER = "com.intermacs";
    }

}
