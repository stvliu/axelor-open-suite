/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2020 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.production.exceptions;

/**
 * Interface of Exceptions.
 *
 * @author dubaux
 */
public interface IExceptionMessage {

  /** Production order service */
  static final String PRODUCTION_ORDER_SEQ = /*$$(*/
      "There's no configured sequence for production's orders" /*)*/;

  /** Production order sale order service */
  static final String PRODUCTION_ORDER_SALES_ORDER_NO_BOM = /*$$(*/
      "There no's defined nomenclature for product %s (%s)" /*)*/;

  /** Manuf order service */
  static final String MANUF_ORDER_SEQ = /*$$(*/
      "There's no configured sequence for fabrication's orders" /*)*/;

  static final String CANNOT_DELETE_REALIZED_STOCK_MOVE_LINES = /*$$(*/
      "You cannot delete realized stock move lines." /*)*/;

  /** Batch Compute work in progress valuation */
  static final String BATCH_COMPUTE_VALUATION = /*$$(*/ "Computed work in progress valuation" /*)*/;

  static final String IN_OR_OUT_INVALID_ARG = /*$$(*/ "inOrOut is invalid" /*)*/;

  /** Bill of Material Service */
  static final String BOM_1 = /*$$(*/ "Personalized" /*)*/;

  /** Production Order Wizard and controller */
  static final String PRODUCTION_ORDER_1 = /*$$(*/ "Production's order created" /*)*/;

  static final String PRODUCTION_ORDER_2 = /*$$(*/
      "Error during production's order's creation" /*)*/;
  static final String PRODUCTION_ORDER_3 = /*$$(*/ "You must add a positive quantity" /*)*/;
  static final String PRODUCTION_ORDER_4 = /*$$(*/ "You must select a nomenclature" /*)*/;
  static final String PRODUCTION_ORDER_5 = /*$$(*/ "Invalid date" /*)*/;

  /** Production Config Service */
  static final String PRODUCTION_CONFIG_1 = /*$$(*/
      "You must configure a production for company %s" /*)*/;

  static final String PRODUCTION_CONFIG_2 = /*$$(*/
      "You must configure a production virtual stock location for company %s" /*)*/;
  static final String PRODUCTION_CONFIG_3 = /*$$(*/
      "You must configure a waste stock location for company %s." /*)*/;
  static final String PRODUCTION_CONFIG_4 = /*$$(*/
      "You must configure a finished products default stock location for company %s." /*)*/;
  static final String PRODUCTION_CONFIG_5 = /*$$(*/
      "You must configure a component default stock location for company %s." /*)*/;
  static final String PRODUCTION_CONFIG_MISSING_MANUF_ORDER_SEQ = /*$$(*/
      "You must configure a sequence for manufacturing order for company %s" /*)*/;

  /** Manuf Order Controller */
  static final String MANUF_ORDER_1 = /*$$(*/
      "Please select the Manufacturing order(s) to print." /*)*/;

  /** Operation Order Controller */
  static final String OPERATION_ORDER_1 = /*$$(*/
      "Please select the Operation order(s) to print." /*)*/;

  /** Sale order line Controller */
  static final String SALE_ORDER_LINE_1 = /*$$(*/ "Personalized nomenclature created" /*)*/;

  /** Production Order Controller */
  static final String PRODUCTION_ORDER_NO_GENERATION = /*$$(*/
      "No production order could be generated. Make sure that everything has been configured correctly. Reminder: check that the order lines that should be produced have their supply method set to 'produce' and that the chosen BoM has a production process associated to it." /*)*/;

  /** ProdProcess service */
  static final String PROD_PROCESS_USELESS_PRODUCT = /*$$(*/
      "The product %s is not in the bill of material related to this production process" /*)*/;

  static final String PROD_PROCESS_MISS_PRODUCT = /*$$(*/
      "Not enough quantity in products to consume for: %s" /*)*/;

  static final String CHARGE_MACHINE_DAYS = /*$$(*/ "Too many days" /*)*/;

  /** Bill of material service */
  static final String COST_TYPE_CANNOT_BE_CHANGED = /*$$(*/
      "The product cost cannot be changed because the product cost type is not manual" /*)*/;

  static final String MAX_DEPTH_REACHED = /*$$(*/ "Max depth reached when copying BOM." /*)*/;

  /** Configurator Controller */
  String BILL_OF_MATERIAL_GENERATED = /*$$(*/ "The bill of material %s has been generated" /*)*/;

  /** Configurator Bom Service */
  String CONFIGURATOR_BOM_TOO_MANY_CALLS = /*$$(*/
      "Too many recursive calls to create the bill of material." /*)*/;

  String CONFIGURATOR_BOM_IMPORT_TOO_MANY_CALLS = /*$$(*/
      "Too many recursive calls to import the bill of material configurator." /*)*/;

  String CONFIGURATOR_BOM_IMPORT_GENERATED_PRODUCT_NULL = /*$$(*/
      "Error while generating bill of material: the product of the bill of material is supposed to be generated from the configurator but the configurator did not generate a product." /*)*/;

  String CONFIGURATOR_BOM_IMPORT_FORMULA_PRODUCT_NULL = /*$$(*/
      "Error while generating bill of material: the product of the bill of material is supposed to be computed from a script but the script did not return a product." /*)*/;

  String CONFIGURATOR_BOM_IMPORT_FILLED_PRODUCT_NULL = /*$$(*/
      "Error while generating bill of material: the product of the bill of material is supposed to be filled in the configurator BOM but it was empty." /*)*/;

  /** Stock move line production controller */
  String STOCK_MOVE_LINE_UNKNOWN_PARENT_CONTEXT = /*$$(*/ "Unknown parent context class." /*)*/;

  /** Production Order Controller */
  static final String MANUF_ORDER_NO_GENERATION = /*$$(*/
      "Cannot add a manufacturing order without a production process. Please check that your chosen bill of material has a valid production process." /*)*/;

  static final String MANUF_ORDER_MISSING_TEMPLATE = /*$$(*/
      "The template to send message for manufacturing order is missing." /*)*/;

  /** Operation Order Workflow Service */
  String WORKCENTER_NO_MACHINE = /*$$(*/ "Please fill the machine in the workcenter %s." /*)*/;

  /** Raw Material RequirementService */
  String RAW_MATERIAL_REQUIREMENT_NO_SEQUENCE = /*$$(*/
      "Error : You must configure a raw material requirement reporting sequence for the company %s" /*)*/;

  static final String ORDER_REMOVE_NOT_OK = /*$$(*/ "You can't remove this record" /*)*/;

  static final String MANUF_ORDER_CANCEL = /*$$(*/ "The manufacturing order was canceled." /*)*/;

  static final String MANUF_ORDER_CANCEL_REASON_ERROR = /*$$(*/
      "A cancel reason must be selected" /*)*/;

  static final String MANUF_ORDER_EMAIL_NOT_SENT = /*$$(*/
      "Automatic email was not sent because no default email account and/or no valid email account was found : please create one." /*)*/;

  static final String MANUF_STOCK_MOVE_ERROR_1 = /*$$(*/ "All products has been consumed" /*)*/;

  static final String UNIT_COST_CALCULATION_IMPORT_FAIL_ERROR = /*$$(*/ "Data import failed" /*)*/;

  static final String UNIT_COST_CALCULATION_IMPORT_CSV_ERROR = /*$$(*/
      "Uploaded file is not a CSV file" /*)*/;

  static final String UNIT_COST_CALCULATION_NO_PRODUCT = /*$$(*/
      "Please select an element (a product, a product category or a product family) to run calculation" /*)*/;
}
